FROM openjdk:17
EXPOSE 8081
ADD target/purchase-coupon-api-docker-v2.jar purchase-coupon-api-docker-v2.jar
ENTRYPOINT ["java","-jar","/purchase-coupon-api-docker-v2.jar"]