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
package org.odftoolkit.odfdom.dom.element.meta;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaCellCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaCharacterCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaDrawCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaFrameCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaImageCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaNonWhitespaceCharacterCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaObjectCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaOleObjectCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaPageCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaParagraphCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaRowCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaSentenceCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaSyllableCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaTableCountAttribute;
import org.odftoolkit.odfdom.dom.attribute.meta.MetaWordCountAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element meta:document-statistic}.
 *
 */
public class MetaDocumentStatisticElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.META, "document-statistic");

	/**
	 * Create the instance of <code>MetaDocumentStatisticElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public MetaDocumentStatisticElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element meta:document-statistic}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaCellCountAttribute</code> , See {@odf.attribute meta:cell-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaCellCountAttribute() {
		MetaCellCountAttribute attr = (MetaCellCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "cell-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaCellCountAttribute</code> , See {@odf.attribute meta:cell-count}
	 *
	 * @param metaCellCountValue   The type is <code>Integer</code>
	 */
	public void setMetaCellCountAttribute(Integer metaCellCountValue) {
		MetaCellCountAttribute attr = new MetaCellCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaCellCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaCharacterCountAttribute</code> , See {@odf.attribute meta:character-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaCharacterCountAttribute() {
		MetaCharacterCountAttribute attr = (MetaCharacterCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "character-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaCharacterCountAttribute</code> , See {@odf.attribute meta:character-count}
	 *
	 * @param metaCharacterCountValue   The type is <code>Integer</code>
	 */
	public void setMetaCharacterCountAttribute(Integer metaCharacterCountValue) {
		MetaCharacterCountAttribute attr = new MetaCharacterCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaCharacterCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaDrawCountAttribute</code> , See {@odf.attribute meta:draw-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaDrawCountAttribute() {
		MetaDrawCountAttribute attr = (MetaDrawCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "draw-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaDrawCountAttribute</code> , See {@odf.attribute meta:draw-count}
	 *
	 * @param metaDrawCountValue   The type is <code>Integer</code>
	 */
	public void setMetaDrawCountAttribute(Integer metaDrawCountValue) {
		MetaDrawCountAttribute attr = new MetaDrawCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaDrawCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaFrameCountAttribute</code> , See {@odf.attribute meta:frame-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaFrameCountAttribute() {
		MetaFrameCountAttribute attr = (MetaFrameCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "frame-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaFrameCountAttribute</code> , See {@odf.attribute meta:frame-count}
	 *
	 * @param metaFrameCountValue   The type is <code>Integer</code>
	 */
	public void setMetaFrameCountAttribute(Integer metaFrameCountValue) {
		MetaFrameCountAttribute attr = new MetaFrameCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaFrameCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaImageCountAttribute</code> , See {@odf.attribute meta:image-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaImageCountAttribute() {
		MetaImageCountAttribute attr = (MetaImageCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "image-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaImageCountAttribute</code> , See {@odf.attribute meta:image-count}
	 *
	 * @param metaImageCountValue   The type is <code>Integer</code>
	 */
	public void setMetaImageCountAttribute(Integer metaImageCountValue) {
		MetaImageCountAttribute attr = new MetaImageCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaImageCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaNonWhitespaceCharacterCountAttribute</code> , See {@odf.attribute meta:non-whitespace-character-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaNonWhitespaceCharacterCountAttribute() {
		MetaNonWhitespaceCharacterCountAttribute attr = (MetaNonWhitespaceCharacterCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "non-whitespace-character-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaNonWhitespaceCharacterCountAttribute</code> , See {@odf.attribute meta:non-whitespace-character-count}
	 *
	 * @param metaNonWhitespaceCharacterCountValue   The type is <code>Integer</code>
	 */
	public void setMetaNonWhitespaceCharacterCountAttribute(Integer metaNonWhitespaceCharacterCountValue) {
		MetaNonWhitespaceCharacterCountAttribute attr = new MetaNonWhitespaceCharacterCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaNonWhitespaceCharacterCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaObjectCountAttribute</code> , See {@odf.attribute meta:object-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaObjectCountAttribute() {
		MetaObjectCountAttribute attr = (MetaObjectCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "object-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaObjectCountAttribute</code> , See {@odf.attribute meta:object-count}
	 *
	 * @param metaObjectCountValue   The type is <code>Integer</code>
	 */
	public void setMetaObjectCountAttribute(Integer metaObjectCountValue) {
		MetaObjectCountAttribute attr = new MetaObjectCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaObjectCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaOleObjectCountAttribute</code> , See {@odf.attribute meta:ole-object-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaOleObjectCountAttribute() {
		MetaOleObjectCountAttribute attr = (MetaOleObjectCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "ole-object-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaOleObjectCountAttribute</code> , See {@odf.attribute meta:ole-object-count}
	 *
	 * @param metaOleObjectCountValue   The type is <code>Integer</code>
	 */
	public void setMetaOleObjectCountAttribute(Integer metaOleObjectCountValue) {
		MetaOleObjectCountAttribute attr = new MetaOleObjectCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaOleObjectCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaPageCountAttribute</code> , See {@odf.attribute meta:page-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaPageCountAttribute() {
		MetaPageCountAttribute attr = (MetaPageCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "page-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaPageCountAttribute</code> , See {@odf.attribute meta:page-count}
	 *
	 * @param metaPageCountValue   The type is <code>Integer</code>
	 */
	public void setMetaPageCountAttribute(Integer metaPageCountValue) {
		MetaPageCountAttribute attr = new MetaPageCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaPageCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaParagraphCountAttribute</code> , See {@odf.attribute meta:paragraph-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaParagraphCountAttribute() {
		MetaParagraphCountAttribute attr = (MetaParagraphCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "paragraph-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaParagraphCountAttribute</code> , See {@odf.attribute meta:paragraph-count}
	 *
	 * @param metaParagraphCountValue   The type is <code>Integer</code>
	 */
	public void setMetaParagraphCountAttribute(Integer metaParagraphCountValue) {
		MetaParagraphCountAttribute attr = new MetaParagraphCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaParagraphCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaRowCountAttribute</code> , See {@odf.attribute meta:row-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaRowCountAttribute() {
		MetaRowCountAttribute attr = (MetaRowCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "row-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaRowCountAttribute</code> , See {@odf.attribute meta:row-count}
	 *
	 * @param metaRowCountValue   The type is <code>Integer</code>
	 */
	public void setMetaRowCountAttribute(Integer metaRowCountValue) {
		MetaRowCountAttribute attr = new MetaRowCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaRowCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaSentenceCountAttribute</code> , See {@odf.attribute meta:sentence-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaSentenceCountAttribute() {
		MetaSentenceCountAttribute attr = (MetaSentenceCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "sentence-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaSentenceCountAttribute</code> , See {@odf.attribute meta:sentence-count}
	 *
	 * @param metaSentenceCountValue   The type is <code>Integer</code>
	 */
	public void setMetaSentenceCountAttribute(Integer metaSentenceCountValue) {
		MetaSentenceCountAttribute attr = new MetaSentenceCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaSentenceCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaSyllableCountAttribute</code> , See {@odf.attribute meta:syllable-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaSyllableCountAttribute() {
		MetaSyllableCountAttribute attr = (MetaSyllableCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "syllable-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaSyllableCountAttribute</code> , See {@odf.attribute meta:syllable-count}
	 *
	 * @param metaSyllableCountValue   The type is <code>Integer</code>
	 */
	public void setMetaSyllableCountAttribute(Integer metaSyllableCountValue) {
		MetaSyllableCountAttribute attr = new MetaSyllableCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaSyllableCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaTableCountAttribute</code> , See {@odf.attribute meta:table-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaTableCountAttribute() {
		MetaTableCountAttribute attr = (MetaTableCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "table-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaTableCountAttribute</code> , See {@odf.attribute meta:table-count}
	 *
	 * @param metaTableCountValue   The type is <code>Integer</code>
	 */
	public void setMetaTableCountAttribute(Integer metaTableCountValue) {
		MetaTableCountAttribute attr = new MetaTableCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaTableCountValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>MetaWordCountAttribute</code> , See {@odf.attribute meta:word-count}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getMetaWordCountAttribute() {
		MetaWordCountAttribute attr = (MetaWordCountAttribute) getOdfAttribute(OdfDocumentNamespace.META, "word-count");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>MetaWordCountAttribute</code> , See {@odf.attribute meta:word-count}
	 *
	 * @param metaWordCountValue   The type is <code>Integer</code>
	 */
	public void setMetaWordCountAttribute(Integer metaWordCountValue) {
		MetaWordCountAttribute attr = new MetaWordCountAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(metaWordCountValue.intValue());
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
