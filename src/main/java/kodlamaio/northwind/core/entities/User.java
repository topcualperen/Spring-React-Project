package kodlamaio.northwind.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="email")
    @Email // kullanabilmek için dependency yazdık
    @NotBlank // Boş geçilmemesi için
    @NotNull
    private String email;

    @Column(name="password")
    @NotBlank
    @NotNull
    private String password;
}

// Core katmanı başka projelerde de kullnılmak için kullanılır.
