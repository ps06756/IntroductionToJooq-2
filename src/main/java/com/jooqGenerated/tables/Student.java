/*
 * This file is generated by jOOQ.
*/
package com.jooqGenerated.tables;


import com.jooqGenerated.Jooq;
import com.jooqGenerated.Keys;
import com.jooqGenerated.tables.records.StudentRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 1532346679;

    /**
     * The reference instance of <code>jooq.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>jooq.student.studentId</code>.
     */
    public final TableField<StudentRecord, Integer> STUDENTID = createField("studentId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq.student.parentId</code>.
     */
    public final TableField<StudentRecord, Integer> PARENTID = createField("parentId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq.student.studentName</code>.
     */
    public final TableField<StudentRecord, String> STUDENTNAME = createField("studentName", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * Create a <code>jooq.student</code> table reference
     */
    public Student() {
        this("student", null);
    }

    /**
     * Create an aliased <code>jooq.student</code> table reference
     */
    public Student(String alias) {
        this(alias, STUDENT);
    }

    private Student(String alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(String alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooq.JOOQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StudentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.KEY_STUDENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(String alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(name, null);
    }
}
