# Todo App
![image](https://github.com/user-attachments/assets/799556cf-64aa-45e0-9f02-c17b6ab61c7f)

**Todo App**, **Java** ve **Spring Boot** kullanarak geliştirilmiş bir **To-Do List** uygulamasıdır. Kullanıcılar yapılacak görevlerini ekleyebilir, listeleyebilir, güncelleyebilir ve silebilir. Veritabanı olarak **PostgreSQL** tercih edilmiştir. Uygulama, API üzerinden **JSON** formatında veri sunar ve **Swagger** ile API dokümantasyonu sağlar.

## Özellikler

- **CRUD** işlemleri: Görev ekleme, listeleme, güncelleme ve silme.
- API üzerinden **JSON** formatında veri iletişimi.
- **Swagger** ile API dokümantasyonu.

## Teknolojiler
- **Java**: Uygulama backend'i için kullanıldı.
- **Spring Boot**: Java tabanlı, hızlı uygulama geliştirme çerçevesi.
- **Spring Data JPA**: Veritabanı işlemleri için ORM.
- **PostgreSQL**: Veritabanı yönetimi.
- **Swagger**: API dokümantasyonu için araç.
- **Maven**: Bağımlılık yönetimi ve yapılandırma.

## Kurulum

### Gereksinimler

- **Java 17** veya daha yüksek bir sürüm.
- **PostgreSQL** veritabanı.
- **Maven**.

### Adımlar

1. Projeyi klonlayın:
   
  ```bash
  git clone https://github.com/ahmetyagiz/toDoApp.git
  ```

2. Proje dizinine gidin:

  ```bash
  cd toDoApp
  ```
   
3. PostgreSQL veritabanını oluşturun:

  ```bash
  CREATE DATABASE todoapp;
  ```

4. application.properties dosyasını aşağıdaki gibi güncelleyin:

  ```bash
  spring.datasource.username = your_username
  spring.datasource.password = your_password
  ```

PostgreSQL veritabanı bağlantısı için doğru **username** ve **password** bilgilerini yazdığınızdan emin olun.

5. Bağımlılıkları indirin:

  ```bash
  mvn clean install
  ```

6. Uygulamayı çalıştırın:

  ```bash
  mvn spring-boot:run
  ```

Uygulama, varsayılan olarak http://localhost:8080 adresinde çalışacaktır.

## Swagger UI
API'nizi daha kolay test etmek için Swagger UI'yi kullanabilirsiniz. Swagger UI'ye erişmek için aşağıdaki adresi ziyaret edebilirsiniz:

  ```bash
  http://localhost:8080/swagger-ui.html
  ```

## Katkıda Bulunma
Bu projeye katkıda bulunmak isterseniz, aşağıdaki adımları izleyebilirsiniz:

Repo'yu forkladıktan sonra, kendi branch'inizde değişiklik yapın.
Yapmak istediğiniz değişiklikleri commit edin.
Değişikliklerinizi pull request olarak gönderin.

## İletişim
Proje hakkında herhangi bir sorunuz varsa, lütfen GitHub issues bölümünden bize ulaşın.
