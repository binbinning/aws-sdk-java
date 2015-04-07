/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Data returned by the <b>DescribeAccountAttributes</b> action.
 * </p>
 */
public class DescribeAccountAttributesResult implements Serializable, Cloneable {

    /**
     * A list of <a>AccountQuota</a> objects. Within this list, each quota
     * has a name, a count of usage toward the quota maximum, and a maximum
     * value for the quota.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota> accountQuotas;

    /**
     * A list of <a>AccountQuota</a> objects. Within this list, each quota
     * has a name, a count of usage toward the quota maximum, and a maximum
     * value for the quota.
     *
     * @return A list of <a>AccountQuota</a> objects. Within this list, each quota
     *         has a name, a count of usage toward the quota maximum, and a maximum
     *         value for the quota.
     */
    public java.util.List<AccountQuota> getAccountQuotas() {
        if (accountQuotas == null) {
              accountQuotas = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota>();
              accountQuotas.setAutoConstruct(true);
        }
        return accountQuotas;
    }
    
    /**
     * A list of <a>AccountQuota</a> objects. Within this list, each quota
     * has a name, a count of usage toward the quota maximum, and a maximum
     * value for the quota.
     *
     * @param accountQuotas A list of <a>AccountQuota</a> objects. Within this list, each quota
     *         has a name, a count of usage toward the quota maximum, and a maximum
     *         value for the quota.
     */
    public void setAccountQuotas(java.util.Collection<AccountQuota> accountQuotas) {
        if (accountQuotas == null) {
            this.accountQuotas = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota> accountQuotasCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota>(accountQuotas.size());
        accountQuotasCopy.addAll(accountQuotas);
        this.accountQuotas = accountQuotasCopy;
    }
    
    /**
     * A list of <a>AccountQuota</a> objects. Within this list, each quota
     * has a name, a count of usage toward the quota maximum, and a maximum
     * value for the quota.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountQuotas A list of <a>AccountQuota</a> objects. Within this list, each quota
     *         has a name, a count of usage toward the quota maximum, and a maximum
     *         value for the quota.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountAttributesResult withAccountQuotas(AccountQuota... accountQuotas) {
        if (getAccountQuotas() == null) setAccountQuotas(new java.util.ArrayList<AccountQuota>(accountQuotas.length));
        for (AccountQuota value : accountQuotas) {
            getAccountQuotas().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>AccountQuota</a> objects. Within this list, each quota
     * has a name, a count of usage toward the quota maximum, and a maximum
     * value for the quota.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountQuotas A list of <a>AccountQuota</a> objects. Within this list, each quota
     *         has a name, a count of usage toward the quota maximum, and a maximum
     *         value for the quota.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountAttributesResult withAccountQuotas(java.util.Collection<AccountQuota> accountQuotas) {
        if (accountQuotas == null) {
            this.accountQuotas = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota> accountQuotasCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountQuota>(accountQuotas.size());
            accountQuotasCopy.addAll(accountQuotas);
            this.accountQuotas = accountQuotasCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountQuotas() != null) sb.append("AccountQuotas: " + getAccountQuotas() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountQuotas() == null) ? 0 : getAccountQuotas().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountAttributesResult == false) return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult)obj;
        
        if (other.getAccountQuotas() == null ^ this.getAccountQuotas() == null) return false;
        if (other.getAccountQuotas() != null && other.getAccountQuotas().equals(this.getAccountQuotas()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAccountAttributesResult clone() {
        try {
            return (DescribeAccountAttributesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    