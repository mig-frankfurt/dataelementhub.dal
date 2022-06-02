/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.enums.ValidationDatatypeType;
import de.dataelementhub.dal.jooq.enums.ValidationSubtypeType;
import de.dataelementhub.dal.jooq.tables.IdentifiedElement;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IdentifiedElementRecord extends TableRecordImpl<IdentifiedElementRecord> implements Record18<Integer, Integer, Integer, Status, Integer, Boolean, Integer, ElementType, Integer, Integer, String, Integer, Integer, ValidationDatatypeType, ValidationSubtypeType, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.identified_element.si_id</code>.
     */
    public void setSiId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.identified_element.si_id</code>.
     */
    public Integer getSiId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.identified_element.si_identifier</code>.
     */
    public void setSiIdentifier(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.identified_element.si_identifier</code>.
     */
    public Integer getSiIdentifier() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.identified_element.si_revision</code>.
     */
    public void setSiRevision(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.identified_element.si_revision</code>.
     */
    public Integer getSiRevision() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.identified_element.si_status</code>.
     */
    public void setSiStatus(Status value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.identified_element.si_status</code>.
     */
    public Status getSiStatus() {
        return (Status) get(3);
    }

    /**
     * Setter for <code>public.identified_element.si_namespace_id</code>.
     */
    public void setSiNamespaceId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.identified_element.si_namespace_id</code>.
     */
    public Integer getSiNamespaceId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.identified_element.si_hidden</code>.
     */
    public void setSiHidden(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.identified_element.si_hidden</code>.
     */
    public Boolean getSiHidden() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.identified_element.e_id</code>.
     */
    public void setEId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.identified_element.e_id</code>.
     */
    public Integer getEId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.identified_element.e_element_type</code>.
     */
    public void setEElementType(ElementType value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.identified_element.e_element_type</code>.
     */
    public ElementType getEElementType() {
        return (ElementType) get(7);
    }

    /**
     * Setter for <code>public.identified_element.e_created_by</code>.
     */
    public void setECreatedBy(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.identified_element.e_created_by</code>.
     */
    public Integer getECreatedBy() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.identified_element.e_element_id</code>.
     */
    public void setEElementId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.identified_element.e_element_id</code>.
     */
    public Integer getEElementId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.identified_element.e_permitted_value</code>.
     */
    public void setEPermittedValue(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.identified_element.e_permitted_value</code>.
     */
    public String getEPermittedValue() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.identified_element.v_id</code>.
     */
    public void setVId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.identified_element.v_id</code>.
     */
    public Integer getVId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.identified_element.v_element_id</code>.
     */
    public void setVElementId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.identified_element.v_element_id</code>.
     */
    public Integer getVElementId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.identified_element.v_datatype</code>.
     */
    public void setVDatatype(ValidationDatatypeType value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.identified_element.v_datatype</code>.
     */
    public ValidationDatatypeType getVDatatype() {
        return (ValidationDatatypeType) get(13);
    }

    /**
     * Setter for <code>public.identified_element.v_subtype</code>.
     */
    public void setVSubtype(ValidationSubtypeType value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.identified_element.v_subtype</code>.
     */
    public ValidationSubtypeType getVSubtype() {
        return (ValidationSubtypeType) get(14);
    }

    /**
     * Setter for <code>public.identified_element.v_format</code>.
     */
    public void setVFormat(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.identified_element.v_format</code>.
     */
    public String getVFormat() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.identified_element.v_unit_of_measure</code>.
     */
    public void setVUnitOfMeasure(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.identified_element.v_unit_of_measure</code>.
     */
    public String getVUnitOfMeasure() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.identified_element.v_maximum_characters</code>.
     */
    public void setVMaximumCharacters(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.identified_element.v_maximum_characters</code>.
     */
    public Integer getVMaximumCharacters() {
        return (Integer) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, Integer, Status, Integer, Boolean, Integer, ElementType, Integer, Integer, String, Integer, Integer, ValidationDatatypeType, ValidationSubtypeType, String, String, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Integer, Integer, Integer, Status, Integer, Boolean, Integer, ElementType, Integer, Integer, String, Integer, Integer, ValidationDatatypeType, ValidationSubtypeType, String, String, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_ID;
    }

    @Override
    public Field<Integer> field2() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_IDENTIFIER;
    }

    @Override
    public Field<Integer> field3() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_REVISION;
    }

    @Override
    public Field<Status> field4() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_STATUS;
    }

    @Override
    public Field<Integer> field5() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_NAMESPACE_ID;
    }

    @Override
    public Field<Boolean> field6() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.SI_HIDDEN;
    }

    @Override
    public Field<Integer> field7() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.E_ID;
    }

    @Override
    public Field<ElementType> field8() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.E_ELEMENT_TYPE;
    }

    @Override
    public Field<Integer> field9() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.E_CREATED_BY;
    }

    @Override
    public Field<Integer> field10() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.E_ELEMENT_ID;
    }

    @Override
    public Field<String> field11() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.E_PERMITTED_VALUE;
    }

    @Override
    public Field<Integer> field12() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_ID;
    }

    @Override
    public Field<Integer> field13() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_ELEMENT_ID;
    }

    @Override
    public Field<ValidationDatatypeType> field14() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_DATATYPE;
    }

    @Override
    public Field<ValidationSubtypeType> field15() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_SUBTYPE;
    }

    @Override
    public Field<String> field16() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_FORMAT;
    }

    @Override
    public Field<String> field17() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_UNIT_OF_MEASURE;
    }

    @Override
    public Field<Integer> field18() {
        return IdentifiedElement.IDENTIFIED_ELEMENT.V_MAXIMUM_CHARACTERS;
    }

    @Override
    public Integer component1() {
        return getSiId();
    }

    @Override
    public Integer component2() {
        return getSiIdentifier();
    }

    @Override
    public Integer component3() {
        return getSiRevision();
    }

    @Override
    public Status component4() {
        return getSiStatus();
    }

    @Override
    public Integer component5() {
        return getSiNamespaceId();
    }

    @Override
    public Boolean component6() {
        return getSiHidden();
    }

    @Override
    public Integer component7() {
        return getEId();
    }

    @Override
    public ElementType component8() {
        return getEElementType();
    }

    @Override
    public Integer component9() {
        return getECreatedBy();
    }

    @Override
    public Integer component10() {
        return getEElementId();
    }

    @Override
    public String component11() {
        return getEPermittedValue();
    }

    @Override
    public Integer component12() {
        return getVId();
    }

    @Override
    public Integer component13() {
        return getVElementId();
    }

    @Override
    public ValidationDatatypeType component14() {
        return getVDatatype();
    }

    @Override
    public ValidationSubtypeType component15() {
        return getVSubtype();
    }

    @Override
    public String component16() {
        return getVFormat();
    }

    @Override
    public String component17() {
        return getVUnitOfMeasure();
    }

    @Override
    public Integer component18() {
        return getVMaximumCharacters();
    }

    @Override
    public Integer value1() {
        return getSiId();
    }

    @Override
    public Integer value2() {
        return getSiIdentifier();
    }

    @Override
    public Integer value3() {
        return getSiRevision();
    }

    @Override
    public Status value4() {
        return getSiStatus();
    }

    @Override
    public Integer value5() {
        return getSiNamespaceId();
    }

    @Override
    public Boolean value6() {
        return getSiHidden();
    }

    @Override
    public Integer value7() {
        return getEId();
    }

    @Override
    public ElementType value8() {
        return getEElementType();
    }

    @Override
    public Integer value9() {
        return getECreatedBy();
    }

    @Override
    public Integer value10() {
        return getEElementId();
    }

    @Override
    public String value11() {
        return getEPermittedValue();
    }

    @Override
    public Integer value12() {
        return getVId();
    }

    @Override
    public Integer value13() {
        return getVElementId();
    }

    @Override
    public ValidationDatatypeType value14() {
        return getVDatatype();
    }

    @Override
    public ValidationSubtypeType value15() {
        return getVSubtype();
    }

    @Override
    public String value16() {
        return getVFormat();
    }

    @Override
    public String value17() {
        return getVUnitOfMeasure();
    }

    @Override
    public Integer value18() {
        return getVMaximumCharacters();
    }

    @Override
    public IdentifiedElementRecord value1(Integer value) {
        setSiId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value2(Integer value) {
        setSiIdentifier(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value3(Integer value) {
        setSiRevision(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value4(Status value) {
        setSiStatus(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value5(Integer value) {
        setSiNamespaceId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value6(Boolean value) {
        setSiHidden(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value7(Integer value) {
        setEId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value8(ElementType value) {
        setEElementType(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value9(Integer value) {
        setECreatedBy(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value10(Integer value) {
        setEElementId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value11(String value) {
        setEPermittedValue(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value12(Integer value) {
        setVId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value13(Integer value) {
        setVElementId(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value14(ValidationDatatypeType value) {
        setVDatatype(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value15(ValidationSubtypeType value) {
        setVSubtype(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value16(String value) {
        setVFormat(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value17(String value) {
        setVUnitOfMeasure(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord value18(Integer value) {
        setVMaximumCharacters(value);
        return this;
    }

    @Override
    public IdentifiedElementRecord values(Integer value1, Integer value2, Integer value3, Status value4, Integer value5, Boolean value6, Integer value7, ElementType value8, Integer value9, Integer value10, String value11, Integer value12, Integer value13, ValidationDatatypeType value14, ValidationSubtypeType value15, String value16, String value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IdentifiedElementRecord
     */
    public IdentifiedElementRecord() {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);
    }

    /**
     * Create a detached, initialised IdentifiedElementRecord
     */
    public IdentifiedElementRecord(Integer siId, Integer siIdentifier, Integer siRevision, Status siStatus, Integer siNamespaceId, Boolean siHidden, Integer eId, ElementType eElementType, Integer eCreatedBy, Integer eElementId, String ePermittedValue, Integer vId, Integer vElementId, ValidationDatatypeType vDatatype, ValidationSubtypeType vSubtype, String vFormat, String vUnitOfMeasure, Integer vMaximumCharacters) {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);

        setSiId(siId);
        setSiIdentifier(siIdentifier);
        setSiRevision(siRevision);
        setSiStatus(siStatus);
        setSiNamespaceId(siNamespaceId);
        setSiHidden(siHidden);
        setEId(eId);
        setEElementType(eElementType);
        setECreatedBy(eCreatedBy);
        setEElementId(eElementId);
        setEPermittedValue(ePermittedValue);
        setVId(vId);
        setVElementId(vElementId);
        setVDatatype(vDatatype);
        setVSubtype(vSubtype);
        setVFormat(vFormat);
        setVUnitOfMeasure(vUnitOfMeasure);
        setVMaximumCharacters(vMaximumCharacters);
    }

    /**
     * Create a detached, initialised IdentifiedElementRecord
     */
    public IdentifiedElementRecord(de.dataelementhub.dal.jooq.tables.pojos.IdentifiedElement value) {
        super(IdentifiedElement.IDENTIFIED_ELEMENT);

        if (value != null) {
            setSiId(value.getSiId());
            setSiIdentifier(value.getSiIdentifier());
            setSiRevision(value.getSiRevision());
            setSiStatus(value.getSiStatus());
            setSiNamespaceId(value.getSiNamespaceId());
            setSiHidden(value.getSiHidden());
            setEId(value.getEId());
            setEElementType(value.getEElementType());
            setECreatedBy(value.getECreatedBy());
            setEElementId(value.getEElementId());
            setEPermittedValue(value.getEPermittedValue());
            setVId(value.getVId());
            setVElementId(value.getVElementId());
            setVDatatype(value.getVDatatype());
            setVSubtype(value.getVSubtype());
            setVFormat(value.getVFormat());
            setVUnitOfMeasure(value.getVUnitOfMeasure());
            setVMaximumCharacters(value.getVMaximumCharacters());
        }
    }
}
