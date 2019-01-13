package com.tutorialspoint;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO{

	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource ds) {

		this.jdbcTemplateObject = new JdbcTemplate(ds);
	}
	

	@Override
	public void create(String name, Integer age,Integer marks,Integer year) {
		try {
			String SQL1 = "insert into Student(name,age)values(?,?)";
			jdbcTemplateObject.update(SQL1,name,age);
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplateObject.queryForInt(SQL2);
			String SQL3 = "insert into Marks(sid,marks,year)"+"values(?,?,?)";
			jdbcTemplateObject.update(SQL3,sid,marks,year);
			System.out.println("Created Name="+name+",Age="+age);
		} catch (DataAccessException e) {
			System.out.println("error in creating record,rolling back");
			throw e;
		}
	}

	@Override
	public Student getStudent(Integer id) {
		return null;
	}

	@Override
	public List<StudentMarks> listStudents() {
		String SQL = "select * from Student,Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}

	@Override
	public void delete(Integer id) {
		
	}

	@Override
	public void update(Integer id, Integer age) {
		
	}

}
