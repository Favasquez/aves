package co.com.ias.entidad;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class GenerateId {

	public Serializable generate() throws HibernateException {
			return "AV"+ UUID.randomUUID().toString();
	}
}
