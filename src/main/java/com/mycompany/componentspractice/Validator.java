
package com.mycompany.componentspractice;

public class Validator {
  private String errors = "";

  public Validator documentId(String documentId) {
    if (!(documentId.length() == 10)) {
      errors += "Cédula, ";
    }

    return this;
  }

  public Validator string(String word, String field) {
    String regexp = "^[a-zA-Z\\s\\W]+$";

    if (!(word.length() > 0) || !word.matches(regexp)) {
      errors += field + ", ";
    }

    return this;
  }

  public Validator email(String word) {
    String regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    if (!word.matches(regexp)) {
      errors += "Email, ";
    }

    return this;
  }

  public void validate() throws Exception {
    if (errors.length() == 0)
      return;

    throw new Exception("Valida los siguientes campos\n" + errors);
  }

  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  public void addToErrors(String error) {
    this.errors += error + ", ";
  }
}
