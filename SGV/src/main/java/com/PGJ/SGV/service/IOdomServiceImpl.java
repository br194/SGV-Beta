package com.PGJ.SGV.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.PGJ.SGV.models.dao.IOdomDao;
import com.PGJ.SGV.models.entity.OdometroAcombus;

@Service
public class IOdomServiceImpl implements IOdomService {

	@Autowired
	private IOdomDao odomDao;

	@Override
	@Transactional(readOnly = true)
	public List<OdometroAcombus> findAll() {
		// TODO Auto-generated method stub
		return (List<OdometroAcombus>) odomDao.findAll();
	}

	@Override
	@Transactional
	public void save(OdometroAcombus odometro) {
		// TODO Auto-generated method stub
		odomDao.save(odometro);
	}

	@Override
	@Transactional(readOnly = true)
	public OdometroAcombus findOne(long id_odo) {
		// TODO Auto-generated method stub
		return odomDao.findById(id_odo).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id_odo) {
		// TODO Auto-generated method stub
		odomDao.deleteById(id_odo);
	}

	@Override
	@Transactional(readOnly = true)
	public int ultimoID() {
		// TODO Auto-generated method stub
		return odomDao.ultimoId();
	}

	@Override
	public OdometroAcombus ObtenerAsignacion(Long id_asignacion) {
		// TODO Auto-generated method stub
		return odomDao.ObtenerAsignacion(id_asignacion);
	}	


}





