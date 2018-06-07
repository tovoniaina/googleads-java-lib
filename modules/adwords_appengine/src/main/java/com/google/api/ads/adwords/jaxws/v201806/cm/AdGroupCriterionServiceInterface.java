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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage criteria (such as {@linkplain Keyword keywords} or
 *       {@linkplain Placement placements}). A criterion describes the conditions that
 *       determine if an ad should display. Two classes of criteria are available:
 *       <ul>
 *       <li>A {@linkplain BiddableAdGroupCriterion biddable criterion} defines
 *       conditions that will cause the parent ad group's ads to display. A biddable
 *       criterion can also specify a bid amount that overrides the parent ad group's
 *       default bid.</li>
 *       <li>A {@linkplain NegativeAdGroupCriterion negative criterion} defines
 *       conditions that will prevent the parent ad group's ads from displaying.</li>
 *       </ul>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupCriterionServiceInterface {


    /**
     * 
     *         Gets adgroup criteria.
     *         
     *         @param serviceSelector filters the adgroup criteria to be returned.
     *         @return a page (subset) view of the criteria selected
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacegetResponse")
    public AdGroupCriterionPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, removes or updates adgroup criteria.
     *         
     *         @param operations operations to do
     *         during checks on keywords to be added.
     *         @return added and updated adgroup criteria (without optional parts)
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacemutateResponse")
    public AdGroupCriterionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        List<AdGroupCriterionOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds labels to the AdGroupCriterion or removes labels from the AdGroupCriterion
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain AdGroupCriterion ad group criterion}. The {@code adGroupId} and
     *         {@code criterionId}
     *         must reference an existing {@linkplain AdGroupCriterion ad group criterion}. The
     *         {@code labelId} must reference an existing {@linkplain Label label}.
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain AdGroupCriterion ad group criterion} and {@linkplain Label label}.</p>
     *         @param operations the operations to apply
     *         @return a list of AdGroupCriterionLabel where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add operation, the returned AdGroupCriterionLabel contains the AdGroupId, CriterionId and the
     *         LabelId. In the case of a remove operation, the returned AdGroupCriterionLabel will only have
     *         AdGroupId and CriterionId.
     *         @throws ApiException when there are one or more errors with the request
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionLabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacemutateLabelResponse")
    public AdGroupCriterionLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        List<AdGroupCriterionLabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of AdGroupCriterion that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns A list of AdGroupCriterion
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.AdGroupCriterionServiceInterfacequeryResponse")
    public AdGroupCriterionPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        String query)
        throws ApiException_Exception
    ;

}
