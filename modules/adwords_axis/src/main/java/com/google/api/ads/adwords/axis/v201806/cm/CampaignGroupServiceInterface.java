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
 * CampaignGroupServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public interface CampaignGroupServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of campaign groups that meet the selector
     * criteria.
     *         
     *         
     * @param selector specifying the {@link CampaignGroup}s to return.
     *         
     * @return A list of campaign groups.
     *         
     * @throws ApiException if problems occurred while fetching campaign
     * group information.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.CampaignGroupPage get(com.google.api.ads.adwords.axis.v201806.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Adds, updates, or deletes campaign groups.
     *         
     *         
     * @param operations A list of unique operations.
     *         
     * @return The list of updated campaign groups, returned in the same
     * order as the
     *         {@code operations} array.
     *         
     * @throws ApiException if problems occurred while updating campaign
     * group information.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.CampaignGroupReturnValue mutate(com.google.api.ads.adwords.axis.v201806.cm.CampaignGroupOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;
}
