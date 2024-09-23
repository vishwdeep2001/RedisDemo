FROM openjdk:8
EXPOSE 8084
ADD out/artifacts/com_example_redis_jar/com.example.redis.jar com.example.redis.jar
ENTRYPOINT ["java","jar","com.example.redis.jar"]