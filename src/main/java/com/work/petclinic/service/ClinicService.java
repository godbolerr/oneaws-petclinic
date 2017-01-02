/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.work.petclinic.service;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import com.work.petclinic.model.Message;
import com.work.petclinic.model.Owner;
import com.work.petclinic.model.Pet;
import com.work.petclinic.model.PetType;
import com.work.petclinic.model.User;
import com.work.petclinic.model.UserProfile;
import com.work.petclinic.model.Vet;
import com.work.petclinic.model.Visit;

/**
 * Mostly used as a facade for all controllers.
 *
 * @author Michael Isvy
 * @author Arnaldo Piccinelli
 */
public interface ClinicService {

	// User
	public User createUser();

	public User saveUser(User user) throws DataAccessException;

	public User findUser(String username) throws DataAccessException;

	public UserProfile createUserProfile(User user);

	// Owner
	public Owner findOwnerById(long id) throws DataAccessException;

	public void saveOwner(Owner owner) throws DataAccessException;

	public Collection<Owner> findOwnerByLastName(String lastName) throws DataAccessException;

	public Collection<Owner> findOwners() throws DataAccessException;

	// Pet
	public Pet findPetById(long id) throws DataAccessException;

	public void savePet(Pet pet) throws DataAccessException;

	public Collection<PetType> findPetTypes() throws DataAccessException;

	// Visit
	public void saveVisit(Visit visit) throws DataAccessException;

	// Vet
	public Collection<Vet> findVets() throws DataAccessException;

	// Message
	public Collection<Message> findMessages() throws DataAccessException;

	public Message saveMessage(Message message) throws DataAccessException;

	public Message findMessage(Long id) throws DataAccessException;

}
