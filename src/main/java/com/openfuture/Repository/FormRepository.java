//form repository
package com.openfuture.Repository;

import com.openfuture.Entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {

}

