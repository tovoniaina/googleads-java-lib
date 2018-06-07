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

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201806/AdService?wsdl")
public class AdService
    extends Service
{

    private final static URL ADSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADSERVICE_EXCEPTION;
    private final static QName ADSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201806", "AdService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201806/AdService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADSERVICE_WSDL_LOCATION = url;
        ADSERVICE_EXCEPTION = e;
    }

    public AdService() {
        super(__getWsdlLocation(), ADSERVICE_QNAME);
    }

    public AdService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdServiceInterface
     */
    @WebEndpoint(name = "AdServiceInterfacePort")
    public AdServiceInterface getAdServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201806", "AdServiceInterfacePort"), AdServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdServiceInterface
     */
    @WebEndpoint(name = "AdServiceInterfacePort")
    public AdServiceInterface getAdServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201806", "AdServiceInterfacePort"), AdServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADSERVICE_EXCEPTION!= null) {
            throw ADSERVICE_EXCEPTION;
        }
        return ADSERVICE_WSDL_LOCATION;
    }

}
