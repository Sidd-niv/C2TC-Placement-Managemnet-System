package com.tns.placementManagementSystem.repository;


import javax.persistence.EntityManager;
import com.tns.placementManagementSystem.entities.Certificate;


public class CertificateRepositoryImp implements ICertificateRepository {
	
	private EntityManager entityManager;
	
	CertificateRepositoryImp()
	{
		entityManager  = JPAUtil.getEntityManager();
	}

	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate cret = entityManager.find(Certificate.class, id);
		return cret;
	}

	@Override
	public void deleteCertificate(long id) {
		Certificate cret = entityManager.find(Certificate.class, id);
		entityManager.remove(cret);
		
	}
	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
