/*
 * Copyright (C) 2017 优客服-多渠道客服系统
 * Modifications copyright (C) 2018-2022 Chatopera Inc, <https://www.chatopera.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chatopera.cc.persistence.repository;

import com.chatopera.cc.model.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, String> {
	Report findByIdAndOrgi(String id, String orgi);
	
	Page<Report> findByOrgiAndDicid(String orgi, String dicid, Pageable paramPageable) ;
	
	Page<Report> findByOrgi(String orgi, Pageable paramPageable) ;
	
	List<Report> findByOrgiAndDicid(String orgi, String dicid) ;
	
	int countByOrgiAndDicid(String orgi, String dicid);
	
	int countByOrgiAndName(String orgi, String name);
}
