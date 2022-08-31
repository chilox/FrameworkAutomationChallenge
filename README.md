**********************************************
*****Framework de Automatización*****
*******************************************

Framework compuesto por tres frentes:   
Modulo Funcional   
Modulo Mobile   
Modulo API

**********************
*****Este sistema esta creado con los frames*****
********************
Karate framework                   
Selenium Webdriver   
Appium            
(JUnit, Cucumber)
**************
**Indicaciones para la operatividad del frame**
********************
Diseñado bajo el patron de diseño **page object model** tenemos la sección
**pages** donde se almacenan por package los selectores de las paginas testeadas
*********************
La sección **features** se encuentran al igual que en la sección antes mencionada
centralizado todos los documentos .feature, en el mismo se encuentra la logina de negocio,
para los test los cuales dependen de ingresar datos, lo podemos agregar en estos documentos cucumber
en el apartado **Examples** cabe destacar que se puede hacer uso de mas de un set de datos,
el sistema ejecutara de maenra automatica todos los set de datos relacionados a scenario
*****************************************
En la Sección ***runner*** se encuentrn los archivos en los cuales configuramos
las rutas de ejecución, los **tags** que estaremos usando para realizar la ejecucion de los test   
***tags***       
**@browser** ==> Nos permite ejecutar los escenarios funcionales los cuales dependen del Browser para ejecutarse  
**@appium** ==> Nos permite ejecutar las pruebas Mobile   
**@api** ==> Nos permite ejecutar las pruebas de servicios API rest
**@ignore** ==> Con este tag indicamos que ignore el escenario/Feature seleccionado

***Nota importante***: Existen dos Archivos para la ejecucion de las pruebas, **KarateRunner** ejecutas las pruebas de servicio
y **Testrunner** ejecutas las pruebas funcionales y mobiles

******************************************
Ya comentamos sobre los archivos de configuración para la ejecución de los test,
 pero en la sección **runner** se encuentra otro paquete, por medio del cual podemos hacer uso de diversos navegadores
******************************************
En sección ***Seleniumgluecode*** nos encontramos una de las estructuras mas importantes,
aquí se encuentran los test funcionales y mobiles, ademas temenemos
el archivo **Hooks** que es el posee la configuración que nos permite seleccionar el tipo de navegador a usar y nos genera
el driver, tambien tenemo el archivo **TestBase**, en el cual se genera el enlace de las pages con los metods y los test.

-------------------------------------
***Reportes***                            
Esta sección es bastante simple ya que una vez se ejecutas las pruebas, el sistema genera de manera automatica un reporte donde
especifica las ejecucuiones que se realziar con el coverge de las mismas.
