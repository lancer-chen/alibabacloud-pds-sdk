// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * get_share request
 */
public class GetShareLinkRequest extends TeaModel {
    // share_id
    @NameInMap("share_id")
    public String shareId;

    public static GetShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareLinkRequest self = new GetShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
