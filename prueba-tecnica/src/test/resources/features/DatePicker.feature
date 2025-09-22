Feature: Automatización del JQuery Datepicker

  Scenario: Reserva de una cita seleccionando una fecha en el calendario
    Given abro la página principal
    When cambio al iframe del calendario
    And hago clic en el campo de fecha
    And selecciono el día "15"
    Then verifico que la fecha aparece en el campo de texto

  Scenario: Selección de una fecha específica en un mes diferente
    Given abro la página principal
    When cambio al iframe del calendario
    And hago clic en el campo de fecha
    And navego al próximo mes
    And selecciono el día "10"
    Then verifico que la fecha aparece en el campo de texto

  Scenario: Validación de campo bloqueado
    Given abro la página principal
    When intento ingresar fecha manualmente
    Then verifico que no se puede editar
