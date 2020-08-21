// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.standard.client.models;

import com.aliyun.tea.*;

/**
 * Update face group info request
 */
public class UpdateFaceGroupInfoRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    // drive_id
    @NameInMap("drive_id")
    @Validation(required = true, pattern = "[0-9]+")
    public String driveId;

    // group_id 列举人脸分组接口中获取
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // group_name
    @NameInMap("group_name")
    public String groupName;

    public static UpdateFaceGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceGroupInfoRequest self = new UpdateFaceGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceGroupInfoRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceGroupInfoRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public UpdateFaceGroupInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateFaceGroupInfoRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
