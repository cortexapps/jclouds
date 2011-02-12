/**
 *
 * Copyright (C) 2010 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.jclouds.cloudstack.options;

import org.jclouds.http.options.BaseHttpRequestOptions;

import com.google.common.collect.ImmutableSet;

/**
 * Options used to control what virtual machines information is returned
 * 
 * @see <a href="http://download.cloud.com/releases/2.2/api/user/listVirtualMachines.html" />
 * @author Adrian Cole
 */
public class ListVirtualMachinesOptions extends BaseHttpRequestOptions {

   public static final ListVirtualMachinesOptions NONE = new ListVirtualMachinesOptions();

   /**
    * @param id
    *           the ID of the virtual machine
    */
   public ListVirtualMachinesOptions id(String id) {
      this.queryParameters.replaceValues("id", ImmutableSet.of(id));
      return this;
   }

   /**
    * @param name
    *           the virtual machine name
    */
   public ListVirtualMachinesOptions name(String name) {
      this.queryParameters.replaceValues("name", ImmutableSet.of(name));
      return this;
   }

   /**
    * @param state
    *           state of the virtual machine
    */
   public ListVirtualMachinesOptions state(String state) {
      this.queryParameters.replaceValues("state", ImmutableSet.of(state));
      return this;
   }

   /**
    * @param domainId
    *           the ID of the domain associated with the virtual machine
    */
   public ListVirtualMachinesOptions domainId(String domainId) {
      this.queryParameters.replaceValues("domainid", ImmutableSet.of(domainId));
      return this;

   }

   /**
    * 
    * @param account
    *           account id
    * @param domain
    *           domain id
    */
   public ListVirtualMachinesOptions accountInDomain(String account, String domain) {
      this.queryParameters.replaceValues("account", ImmutableSet.of(account));
      return domainId(domain);
   }

   /**
    * @param groupId
    *           list virtual machines by groupId.
    */
   public ListVirtualMachinesOptions groupId(String groupId) {
      this.queryParameters.replaceValues("groupid", ImmutableSet.of(groupId));
      return this;

   }

   /**
    * @param hostId
    *           list virtual machines by hostId.
    */
   public ListVirtualMachinesOptions hostId(String hostId) {
      this.queryParameters.replaceValues("hostid", ImmutableSet.of(hostId));
      return this;

   }

   /**
    * @param networkId
    *           list virtual machines by networkId.
    */
   public ListVirtualMachinesOptions networkId(String networkId) {
      this.queryParameters.replaceValues("networkid", ImmutableSet.of(networkId));
      return this;

   }

   /**
    * @param podId
    *           list virtual machines by podId.
    */
   public ListVirtualMachinesOptions podId(String podId) {
      this.queryParameters.replaceValues("podid", ImmutableSet.of(podId));
      return this;

   }

   /**
    * @param zoneId
    *           list virtual machines by zoneId.
    */
   public ListVirtualMachinesOptions zoneId(String zoneId) {
      this.queryParameters.replaceValues("zoneid", ImmutableSet.of(zoneId));
      return this;

   }

   /**
    * @param usesVirtualNetwork
    *           list by network type; true if need to list vms using Virtual Network, false
    *           otherwise
    */
   public ListVirtualMachinesOptions usesVirtualNetwork(boolean usesVirtualNetwork) {
      this.queryParameters.replaceValues("forvirtualnetwork", ImmutableSet.of(usesVirtualNetwork + ""));
      return this;
   }

   public static class Builder {

      /**
       * @see ListVirtualMachinesOptions#accountInDomain
       */
      public static ListVirtualMachinesOptions accountInDomain(String account, String domain) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.accountInDomain(account, domain);
      }

      /**
       * @see ListVirtualMachinesOptions#domainId
       */
      public static ListVirtualMachinesOptions domainId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.domainId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#id
       */
      public static ListVirtualMachinesOptions id(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.id(id);
      }

      /**
       * @see ListVirtualMachinesOptions#name
       */
      public static ListVirtualMachinesOptions name(String name) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.name(name);
      }

      /**
       * @see ListVirtualMachinesOptions#state
       */
      public static ListVirtualMachinesOptions state(String state) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.state(state);
      }

      /**
       * @see ListVirtualMachinesOptions#groupId
       */
      public static ListVirtualMachinesOptions groupId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.groupId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#hostId
       */
      public static ListVirtualMachinesOptions hostId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.hostId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#networkId
       */
      public static ListVirtualMachinesOptions networkId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.networkId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#podId
       */
      public static ListVirtualMachinesOptions podId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.podId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#zoneId
       */
      public static ListVirtualMachinesOptions zoneId(String id) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.zoneId(id);
      }

      /**
       * @see ListVirtualMachinesOptions#usesVirtualNetwork
       */
      public static ListVirtualMachinesOptions usesVirtualNetwork(boolean usesVirtualNetwork) {
         ListVirtualMachinesOptions options = new ListVirtualMachinesOptions();
         return options.usesVirtualNetwork(usesVirtualNetwork);
      }
   }
}
