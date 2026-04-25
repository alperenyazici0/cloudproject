# Projende kullandığın Java sürümünü temel alıyoruz (Java 25/21 vb. hangisiyse)
FROM eclipse-temurin:25-jdk-alpine
VOLUME /tmp
# GitHub Actions'ın target klasöründe oluşturacağı JAR dosyasını kopyala
COPY target/*.jar app.jar
# Uygulamayı çalıştır
ENTRYPOINT ["java","-jar","/app.jar"]