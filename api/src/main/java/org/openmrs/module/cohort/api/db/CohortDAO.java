/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.cohort.api.db;

import java.util.List;

import org.openmrs.module.cohort.CohortAttribute;
import org.openmrs.module.cohort.CohortAttributeType;
import org.openmrs.module.cohort.CohortEncounter;
import org.openmrs.module.cohort.CohortM;
import org.openmrs.module.cohort.CohortMember;
import org.openmrs.module.cohort.CohortObs;
import org.openmrs.module.cohort.CohortProgram;
import org.openmrs.module.cohort.CohortRole;
import org.openmrs.module.cohort.CohortType;
import org.openmrs.module.cohort.CohortVisit;

/**
 * Database methods for {@link cohortService}.
 */
public interface CohortDAO {
	
	CohortAttribute getCohortAttributeById(Integer id);
	CohortAttribute getCohortAttributeByUuid(String uuid);
	CohortAttribute getCohortAttributeUuid(String uuid);
	CohortAttribute saveCohortAttributes(CohortAttribute att);
	
	CohortAttributeType getCohortAttributeTypeById(Integer id);
	CohortAttributeType getCohortAttributeTypeByUuid(String uuid);
	CohortAttributeType getCohortAttributeTypeUuid(String uuid);
	CohortAttributeType getCohortAttributes(Integer cohort_attribute_type_id);
	CohortAttributeType saveCohortAttributes(CohortAttributeType attributes);
	
	CohortEncounter getCohortEncounter(Integer id);
	CohortEncounter getCohortEncounterById(Integer id);
	CohortEncounter getCohortEncounterByUuid(String uuid);
	CohortEncounter getCohortEncounterUuid(String uuid);
	CohortEncounter saveCohortEncounters(CohortEncounter cencounters);
	
	CohortM getCohortId(Integer id);
	CohortM getCohortMById(Integer id);
	CohortM getCohortMByUuid(String uuid);
	CohortM getCohortUuid(String uuid);
	CohortM saveCohort(CohortM cohort);
	
	CohortMember getCohortMemUuid(String uuid);
	CohortMember getCohortMemberById(Integer id);
	CohortMember getCohortMemberByUuid(String uuid);
	CohortMember saveCPatient(CohortMember cohort);
	
	CohortObs getCohortObsById(Integer id);
	CohortObs getCohortObsByUuid(String uuid);
	CohortObs getCohortObsUuid(String uuid);
	CohortObs saveCohortObs(CohortObs cobs);
	CohortObs saveObs(CohortObs obs);
	
	CohortProgram getCohortProgramById(Integer id);
	CohortProgram getCohortProgramByUuid(String uuid);
	CohortProgram getCohortProgramUuid(String uuid);
	CohortProgram saveCohortProgram(CohortProgram cohort);
	
	CohortRole getCohortRoleById(Integer id);
	CohortRole getCohortRoleByUuid(String uuid);
	CohortRole getCohortRoleUuid(String uuid);
	CohortRole saveCohortRole(CohortRole cohort);
	
	CohortType getCohortType(Integer id);
	CohortType getCohortTypeById(Integer id);
	CohortType getCohortTypeByUuid(String uuid);
	CohortType getCohortTypeUuid(String uuid);
	CohortType saveCohortType(CohortType cohorttype);
	
	CohortVisit getCohortVisitById(Integer id);
	CohortVisit getCohortVisitByUuid(String uuid);
	CohortVisit getCohortVisitUuid(String uuid);
	CohortVisit saveCohortVisit(CohortVisit cvisit);
	
	List<CohortAttribute> findCohortAtt(Integer id);
	List<CohortAttribute> findCohortAttribute(String name);
	
	List<CohortAttributeType> findCohortAttType(Integer id);
	List<CohortAttributeType> findCohortAttributes();
	List<CohortAttributeType> findCohortAttributes(String attribute_type_name);
	
	List<CohortEncounter> findCohortEnc(Integer id);
	List<CohortEncounter> findCohortEncounter(String cohort, String location);
	List<CohortEncounter> findCohortEncounters();
	List<CohortEncounter> findCohortEncounters(String name);
	List<CohortEncounter> getEncounters(EncounterSearchCriteria searchCriteria);
	List<CohortEncounter> getEncounters(String query, Integer cohortId, Integer start, Integer length, boolean includeVoided);
	
	List<CohortM> findCohort(Integer id);
	List<CohortM> findCohorts();
	List<CohortM> findCohorts(String cohort_module);
	List<CohortM> getCohort(Integer id);
	List<CohortM> getCohortsByLocationId(Integer id);
	List<CohortM> getCohortByCohortTypeId(Integer id);
	List<CohortM> getCohortByCohortProgramId(Integer id);
	
	List<CohortMember> findCohortMember();
	List<CohortMember> findCohortMember(String name);
	List<CohortMember> findCohortMembersByCohortId (Integer cohortId);
	List<CohortMember> getCohortMember(Integer id);
	List<CohortMember> getCohortMembersByCohortRoleId(Integer id);
	
	List<CohortObs> findCohortObs();
	List<CohortObs> findCohortObs(Integer id);
	
	List<CohortProgram> findCohortProg();
	List<CohortProgram> findCohortProgram(Integer id);
	List<CohortProgram> findCohortProgram(String name);
	
	List<CohortRole> findCohortRole(Integer id);
	List<CohortRole> findCohortRole(String cohort_name);
	List<CohortRole> findCohortRoles(String name);
	List<CohortRole> findRoles(String name);
	
	List<CohortType> findCohortType();
	List<CohortType> findCohortType(Integer id);
	List<CohortType> findCohortType(String cohort_name);
	List<CohortType> getAllCohortTypes();
	
	List<CohortVisit> findCohortVisit();
	List<CohortVisit> findCohortVisit(Integer id);
	List<CohortVisit> findCohortVisit(String name);
	
	Long getCount(String name);
	void purgeCohort(CohortM cohort);
	void purgeCohortAtt(CohortAttribute att);
	void purgeCohortAttributes(CohortAttributeType attributes);
	void purgeCohortEncounters(CohortEncounter cencounters);
	void purgeCohortObs(CohortObs cobs);
	void purgeCohortProgram(CohortProgram cvisit);
	void purgeCohortRole(CohortRole crole);
	void purgeCohortType(CohortType cohort);
	void purgeCohortVisit(CohortVisit cvisit);	
}
