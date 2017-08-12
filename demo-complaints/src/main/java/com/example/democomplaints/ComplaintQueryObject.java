package com.example.democomplaints;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Thanak Ngan (t.ngan@gl-f.com) on 8/12/2017.
 */
@Entity
public class ComplaintQueryObject {

  @Id
  private String complaintId;
  private String company;
  private String description;

  public ComplaintQueryObject() {

  }

  public ComplaintQueryObject(String complaintId, String company, String description) {
    this.complaintId = complaintId;
    this.company = company;
    this.description = description;
  }

  public String getComplaintId() {
    return complaintId;
  }

  public String getCompany() {
    return company;
  }

  public String getDescription() {
    return description;
  }
}
