from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

# --- CONFIGURACIÓN ---
URL = "https://jqueryui.com/datepicker/"
FECHA_OBJETIVO = {"dia": "15", "mes": "September", "año": "2025"}

# Iniciar el navegador (Chrome)
driver = webdriver.Chrome()  # Asegúrate de que chromedriver esté en tu PATH
driver.maximize_window()


# 1. Abrir la página
driver.get(URL)
print("hola")
# 2. Cambiar al iframe que contiene el calendario
WebDriverWait(driver, 10).until(
    EC.frame_to_be_available_and_switch_to_it((By.CSS_SELECTOR, ".demo-frame"))
)

# 3. Hacer clic en el campo para abrir el datepicker
date_input = WebDriverWait(driver, 10).until(
    EC.element_to_be_clickable((By.ID, "datepicker"))
)
date_input.click()

# 4. Navegar al mes y año deseado
while True:
    mes_visible = driver.find_element(By.CLASS_NAME, "ui-datepicker-month").text
    año_visible = driver.find_element(By.CLASS_NAME, "ui-datepicker-year").text

    if mes_visible == FECHA_OBJETIVO["mes"] and año_visible == FECHA_OBJETIVO["año"]:
        break
    else:
        # Click en el botón de "Next"
        next_button = driver.find_element(By.CLASS_NAME, "ui-datepicker-next")
        next_button.click()
        time.sleep(0.5)

# 5. Seleccionar el día deseado
dias = driver.find_elements(By.XPATH, "//a[@class='ui-state-default']")
for dia in dias:
    if dia.text == FECHA_OBJETIVO["dia"]:
        dia.click()
        break

# 6. Esperar y cerrar
time.sleep(2)


driver.quit()