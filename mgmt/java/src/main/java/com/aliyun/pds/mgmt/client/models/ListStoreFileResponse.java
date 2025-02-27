// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * List storage file
 */
public class ListStoreFileResponse extends TeaModel {
    // items
    // file list
    @NameInMap("items")
    public java.util.List<StoreFile> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListStoreFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStoreFileResponse self = new ListStoreFileResponse();
        return TeaModel.build(map, self);
    }

    public ListStoreFileResponse setItems(java.util.List<StoreFile> items) {
        this.items = items;
        return this;
    }
    public java.util.List<StoreFile> getItems() {
        return this.items;
    }

    public ListStoreFileResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
