// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * List drive request
 */
public class ListDriveRequest extends TeaModel {
    @NameInMap("httpheaders")
    public java.util.Map<String, String> httpheaders;

    // 每页大小限制
    @NameInMap("limit")
    public Integer limit;

    // 翻页标记, 接口返回的标记值
    @NameInMap("marker")
    public String marker;

    // 所属者
    @NameInMap("owner")
    public String owner;

    // owner_type
    // 所述者类型
    @NameInMap("owner_type")
    public String ownerType;

    // Subdomain ID
    @NameInMap("subdomain_id")
    public String subdomainId;

    public static ListDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDriveRequest self = new ListDriveRequest();
        return TeaModel.build(map, self);
    }

    public ListDriveRequest setHttpheaders(java.util.Map<String, String> httpheaders) {
        this.httpheaders = httpheaders;
        return this;
    }
    public java.util.Map<String, String> getHttpheaders() {
        return this.httpheaders;
    }

    public ListDriveRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListDriveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListDriveRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public ListDriveRequest setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }
    public String getSubdomainId() {
        return this.subdomainId;
    }

}
