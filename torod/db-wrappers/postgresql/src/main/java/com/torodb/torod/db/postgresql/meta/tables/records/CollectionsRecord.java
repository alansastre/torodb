/*
 *     This file is part of ToroDB.
 *
 *     ToroDB is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     ToroDB is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with ToroDB. If not, see <http://www.gnu.org/licenses/>.
 *
 *     Copyright (c) 2014, 8Kdata Technology
 *     
 */
package com.torodb.torod.db.postgresql.meta.tables.records;

import com.torodb.torod.db.postgresql.meta.tables.CollectionsTable;
import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

public class CollectionsRecord extends UpdatableRecordImpl<CollectionsRecord> 
        implements Record7<String, String, Boolean, Integer, Integer, String, String> {

	private static final long serialVersionUID = -2107968478;

	/**
	 * Setter for <code>torodb.collections.name</code>.
	 */
	public void setName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>torodb.collections.name</code>.
	 */
	public String getName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>torodb.collections.schema</code>.
	 */
	public void setSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>torodb.collections.schema</code>.
	 */
	public String getSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>torodb.collections.capped</code>.
	 */
	public void setCapped(Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>torodb.collections.capped</code>.
	 */
	public Boolean isCapped() {
		return (Boolean) getValue(2);
	}

	/**
	 * Setter for <code>torodb.collections.max_size</code>.
	 */
	public void setMaxSize(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>torodb.collections.max_size</code>.
	 */
	public Integer getMaxSize() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>torodb.collections.max_elementes</code>.
	 */
	public void setMaxElementes(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>torodb.collections.max_elementes</code>.
	 */
	public Integer getMaxElementes() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>torodb.collections.other</code>.
	 */
	public void setOther(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>torodb.collections.other</code>.
	 */
	public String getOther() {
		return (String) getValue(5);
	}
    
    public void setStorageEngine(String engine) {
        setValue(6, engine);
    }
    
    public String getStorageEngine() {
        return (String) getValue(6);
    }

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, Boolean, Integer, Integer, String, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, Boolean, Integer, Integer, String, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return CollectionsTable.COLLECTIONS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CollectionsTable.COLLECTIONS.SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field3() {
		return CollectionsTable.COLLECTIONS.CAPPED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return CollectionsTable.COLLECTIONS.MAX_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return CollectionsTable.COLLECTIONS.MAX_ELEMENTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return CollectionsTable.COLLECTIONS.OTHER;
	}
    
    public Field<String> field7() {
        return CollectionsTable.COLLECTIONS.STORAGE_ENGINE;
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value3() {
		return isCapped();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getMaxSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getMaxElementes();
	}
    
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getOther();
	}
    
    @Override
	public String value7() {
		return getStorageEngine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value1(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value2(String value) {
		setSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value3(Boolean value) {
		setCapped(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value4(Integer value) {
		setMaxSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value5(Integer value) {
		setMaxElementes(value);
		return this;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord value6(String value) {
		setOther(value);
		return this;
	}
    
    public CollectionsRecord value7(String value) {
		setStorageEngine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollectionsRecord values(String value1, String value2, Boolean value3, Integer value4, Integer value5, String value6, String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CollectionsRecord
	 */
	public CollectionsRecord() {
		super(CollectionsTable.COLLECTIONS);
	}

	/**
	 * Create a detached, initialised CollectionsRecord
	 */
	public CollectionsRecord(String name, String schema, Boolean capped, Integer maxSize, Integer maxElementes, String other, String storageEngine) {
		super(CollectionsTable.COLLECTIONS);

		setValue(0, name);
		setValue(1, schema);
		setValue(2, capped);
		setValue(3, maxSize);
		setValue(4, maxElementes);
		setValue(5, other);
        setValue(6, storageEngine);
	}
}
