/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:properties}.
 *
 */
public class FormPropertiesElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.FORM, "properties");

	/**
	 * Create the instance of <code>FormPropertiesElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormPropertiesElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:properties}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element form:list-property}.
	 *
	 * @param formPropertyNameValue  the <code>String</code> value of <code>FormPropertyNameAttribute</code>, see {@odf.attribute  form:property-name} at specification
	 * @param officeValueTypeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @return the element {@odf.element form:list-property}
	 */
	 public FormListPropertyElement newFormListPropertyElement(String formPropertyNameValue, String officeValueTypeValue) {
		FormListPropertyElement formListProperty = ((OdfFileDom) this.ownerDocument).newOdfElement(FormListPropertyElement.class);
		formListProperty.setFormPropertyNameAttribute(formPropertyNameValue);
		formListProperty.setOfficeValueTypeAttribute(officeValueTypeValue);
		this.appendChild(formListProperty);
		return formListProperty;
	}

	/**
	 * Create child element {@odf.element form:property}.
	 *
	 * @param formPropertyNameValue  the <code>String</code> value of <code>FormPropertyNameAttribute</code>, see {@odf.attribute  form:property-name} at specification
	 * @param officeValueValue  the <code>Double</code> value of <code>OfficeValueAttribute</code>, see {@odf.attribute  office:value} at specification
	 * @param officeValueTypeValue  the <code>String</code> value of <code>OfficeValueTypeAttribute</code>, see {@odf.attribute  office:value-type} at specification
	 * @return the element {@odf.element form:property}
	 */
	 public FormPropertyElement newFormPropertyElement(String formPropertyNameValue, double officeValueValue, String officeValueTypeValue) {
		FormPropertyElement formProperty = ((OdfFileDom) this.ownerDocument).newOdfElement(FormPropertyElement.class);
		formProperty.setFormPropertyNameAttribute(formPropertyNameValue);
		formProperty.setOfficeValueAttribute(officeValueValue);
		formProperty.setOfficeValueTypeAttribute(officeValueTypeValue);
		this.appendChild(formProperty);
		return formProperty;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
