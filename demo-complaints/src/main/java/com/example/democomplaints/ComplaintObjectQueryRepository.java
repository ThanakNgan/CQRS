package com.example.democomplaints;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Thanak Ngan (t.ngan@gl-f.com) on 8/12/2017.
 */
@Repository
public interface ComplaintObjectQueryRepository extends JpaRepository<ComplaintQueryObject, String>{
}
