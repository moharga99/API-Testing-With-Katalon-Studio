@api @bdd @reqres
Feature: All Request API Reqres

  @GetListUsers
  Scenario Outline: Get List Users
    Given A list of users are available
    When User send request get list users
    Then System will display response status code <statuscode> and page <page> and total pages <totalpages>

    Examples: 
      | statuscode | page | totalpages |
      | "200"      | "1"  | "2"        |

  @GetSingleUser
  Scenario Outline: Get Single User
    Given A list of users are available
    When User send request get specific user
    Then System will display response status code <statuscode> and id <id> and email <email>

    Examples: 
      | statuscode | id  | email                    |
      | "200"      | "2" | "janet.weaver@reqres.in" |

  @UserRegisterSuccessfull
  Scenario Outline: User Register Successfull
    Given User has fill all data correctly
    When User submit form registration
    Then System will display response status code <statuscode> and email <email> and password <password>

    Examples: 
      | statuscode | email                     | password   |
      | "201"      | "mohamadarga@yopmail.com" | "Abc123##" |

  @UpdateUser
  Scenario Outline: Update User
    Given User has been registered
    When User update data
    Then System will display response status code <statuscode> and name <name> and jobs <jobs>

    Examples: 
      | statuscode | name           | jobs   |
      | "200"      | "Mohamad Arga" | "SDET" |
