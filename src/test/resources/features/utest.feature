# Autor: Jean
  @Storie
  Feature: Register an user
    As an user, i want to register an user
  @scenario
  Scenario: Register an user successufully
    Given i enter on Utest web site
    When I type my personal information
    |firstName|lastName|email           |month  |day|year |language|city      |postal|country |computer|version|mobil   |model  |system     |password   |
    |Mark     |Moven   |m.moven@test.com|June   |10 |1996 |Arabic  |Veracruz  |507   |Colombia|Linux   |Fedora |Xiaomi  |Hongmi |Android 4.2|Chou1234@@ |
    Then I complete my Register
    |completed    |
    |The last step|