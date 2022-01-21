package com.vuacademy.training.service;

import java.util.ArrayList;
import java.util.List;

import com.vuacademy.training.commons.NorthwindException;
import com.vuacademy.training.dao.StateDAO;
import com.vuacademy.training.model.State;

public class StateService {
	 private StateDAO stateDAO = new StateDAO();
	public void saveState(State state) throws NorthwindException{
		stateDAO.saveState(state);
	 }
	
	public State findState(int stateId) throws NorthwindException{
		 State state = null;
		 stateDAO.findState(stateId);
		 return state;
	 }
	 
	 public List<State> getAllState() throws NorthwindException{
		 List<State> states = new ArrayList<State>();
	  	 states = stateDAO.getAllState();
		 return states;
	 }
	 
	 public void deleteState(int stateId) throws NorthwindException{
		 stateDAO.deleteState(stateId);
	 }
	 
	 public void updateState(State state) throws NorthwindException{
		 stateDAO.updateState(state);
		 
	 }
}
