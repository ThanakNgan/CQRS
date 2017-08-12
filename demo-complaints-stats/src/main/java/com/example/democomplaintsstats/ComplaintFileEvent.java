package com.example.democomplaintsstats;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Thanak Ngan (t.ngan@gl-f.com) on 8/12/2017.
 */
public class ComplaintFileEvent {

  private final String id;
  private final String company;
  private final String description;

  public ComplaintFileEvent(String id, String company, String description) {
    this.id = id;
    this.company = company;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public String getCompany() {
    return company;
  }

  public String getDescription() {
    return description;
  }
}
