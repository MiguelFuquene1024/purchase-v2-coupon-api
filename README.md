# purchase-v2-coupon-api
Api de compra de cupones(Nivel 2)

## Autor

- Miguel Angel Fuquene Arias

## Contrucción

- IntelliJ-Editor de código y ambiente de desarrollo(IDE)
- Maven-gestor de dependencias
- SpringBoot- Framework creación de APIs
- MySql- Base de datos
- Postman- Herramienta para envio de solicitudes a servidores web y recibir las respuestas correspondientes.
- Docker - Plataforma de contenedores para desplegar y prueba del proyecto como segunda opcion.
- Amazon Web Services(Servidor para despliegue y configuracion de servicios).
- Amazon DynamoDB(Db para gestion de información)


## Requerimientos
- Java 17 o superior
- Tener un Ide como IntelliJ, Eclipse o STS
- Spring framework
- Maven 3.0 o superior
- Tener instalado Postman para envio de peticiones


- En su directorio de preferencia ejecute el comando git clone https://github.com/MiguelFuquene1024/purchase-v2-coupon-api.git
- Acceda a su IDE por ejemplo IntelliJ, busque la ruta donde clono el repositorio y abra el proyecto.
- Abra la terminal y ejecute los siguientes comandos
  . mvn clean
  . mvn compile
- Luego corra la aplicación,deberá verse como la imagen a continuación:

![](https://github.com/MiguelFuquene1024/purchase-v2-coupon-api/blob/master/img/EjecucionV2.png)


- Esta Api tendrá una funcionalidades principal:
- Puede consultar cuales son los 5 productos favoritos mas canjeados.
- Esta Api consumira otra para obtener estos 5 productos.


## Pasos para ejecucion

- si ya compilo el proyecto, el siguiente paso es ejecutarlo con mvn spring-boot:run o simplemente darle click derecho en la clase main(CouponApplication) y darle run en caso de intellij.

## Prueba local
- Ahora para probar el servicio ingrese a postman , cree una nueva petición de tipo GET, pegue la siguiente url (http://localhost:8080/top5) y envie el request.
- La respuesta se evidenciara en la imagen:

![](https://github.com/MiguelFuquene1024/purchase-v2-coupon-api/blob/master/img/localV2.png)

## Prueba por el navegador

- Para probar el servicio expuesto en AWS cambie o cree un nuevo request con la siguiente url (http://lb-aws-api-v2-1214868143.us-east-1.elb.amazonaws.com/top5) y envie el request.
- Debe responder como se muestra en la imagen.

![](https://github.com/MiguelFuquene1024/purchase-v2-coupon-api/blob/master/img/PruebaAWSV2.png)


