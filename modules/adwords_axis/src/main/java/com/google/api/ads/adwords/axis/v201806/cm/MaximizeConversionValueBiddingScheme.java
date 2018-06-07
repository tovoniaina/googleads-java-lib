// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * MaximizeConversionValueBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;


/**
 * Maximize Conversion Value bidding strategy is an automated bidding
 * strategy which tries to
 *             maximize conversion value given a daily budget.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class MaximizeConversionValueBiddingScheme  extends com.google.api.ads.adwords.axis.v201806.cm.BiddingScheme  implements java.io.Serializable {
    /* The target return on ad spend (ROAS). This is optional. If
     * set, the bid strategy will
     *                     maximize revenue while averaging the target return
     * on ad spend. If the target ROAS is high,
     *                     the bid strategy may not be able to spend the
     * full budget. If the target ROAS is not set, the
     *                     bid strategy will aim to achieve the highest possible
     * ROAS for the budget.
     *                     <span class="constraint InRange">This field must
     * be between 0.0 and 1.7976931348623157E308, inclusive.</span> */
    private java.lang.Double targetRoas;

    public MaximizeConversionValueBiddingScheme() {
    }

    public MaximizeConversionValueBiddingScheme(
           java.lang.String biddingSchemeType,
           java.lang.Double targetRoas) {
        super(
            biddingSchemeType);
        this.targetRoas = targetRoas;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("biddingSchemeType", getBiddingSchemeType())
            .add("targetRoas", getTargetRoas())
            .toString();
    }

    /**
     * Gets the targetRoas value for this MaximizeConversionValueBiddingScheme.
     * 
     * @return targetRoas   * The target return on ad spend (ROAS). This is optional. If
     * set, the bid strategy will
     *                     maximize revenue while averaging the target return
     * on ad spend. If the target ROAS is high,
     *                     the bid strategy may not be able to spend the
     * full budget. If the target ROAS is not set, the
     *                     bid strategy will aim to achieve the highest possible
     * ROAS for the budget.
     *                     <span class="constraint InRange">This field must
     * be between 0.0 and 1.7976931348623157E308, inclusive.</span>
     */
    public java.lang.Double getTargetRoas() {
        return targetRoas;
    }


    /**
     * Sets the targetRoas value for this MaximizeConversionValueBiddingScheme.
     * 
     * @param targetRoas   * The target return on ad spend (ROAS). This is optional. If
     * set, the bid strategy will
     *                     maximize revenue while averaging the target return
     * on ad spend. If the target ROAS is high,
     *                     the bid strategy may not be able to spend the
     * full budget. If the target ROAS is not set, the
     *                     bid strategy will aim to achieve the highest possible
     * ROAS for the budget.
     *                     <span class="constraint InRange">This field must
     * be between 0.0 and 1.7976931348623157E308, inclusive.</span>
     */
    public void setTargetRoas(java.lang.Double targetRoas) {
        this.targetRoas = targetRoas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaximizeConversionValueBiddingScheme)) return false;
        MaximizeConversionValueBiddingScheme other = (MaximizeConversionValueBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetRoas==null && other.getTargetRoas()==null) || 
             (this.targetRoas!=null &&
              this.targetRoas.equals(other.getTargetRoas())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTargetRoas() != null) {
            _hashCode += getTargetRoas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaximizeConversionValueBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "MaximizeConversionValueBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRoas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "targetRoas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
