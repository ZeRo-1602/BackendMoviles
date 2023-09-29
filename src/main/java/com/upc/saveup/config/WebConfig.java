package com.upc.saveup.config;

        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.config.annotation.CorsRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/*")
//                .allowedOrigins("https://saveupopen.netlify.app","https://backendmoviles-production.up.railway.app")
//                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//
//    }
//}

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permitir todas las rutas
                .allowedOrigins("*")  // Permitir cualquier origen
                .allowedMethods("*")  // Permitir cualquier método (GET, POST, PUT, DELETE, etc.)
                .allowedHeaders("*")  // Permitir cualquier encabezado
                .allowCredentials(true);  // Permitir credenciales

    }
}