package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.College;

public interface ICollegeRepository {
	
public void addCollege(College college);

public void updateCollege(College college);

public College searchCollege(String college);

public void deleteCollege(long id);

void beginTransaction();

void commitTransaction();


}
