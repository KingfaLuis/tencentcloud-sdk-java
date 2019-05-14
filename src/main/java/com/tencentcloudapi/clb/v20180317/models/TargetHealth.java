/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealth  extends AbstractModel{

    /**
    * Target的内网IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Target绑定的端口
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 当前健康状态，true：健康，false：不健康。
    */
    @SerializedName("HealthStatus")
    @Expose
    private Boolean HealthStatus;

    /**
    * Target的实例ID，如 ins-12345678
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
     * 获取Target的内网IP
     * @return IP Target的内网IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * 设置Target的内网IP
     * @param IP Target的内网IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * 获取Target绑定的端口
     * @return Port Target绑定的端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置Target绑定的端口
     * @param Port Target绑定的端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取当前健康状态，true：健康，false：不健康。
     * @return HealthStatus 当前健康状态，true：健康，false：不健康。
     */
    public Boolean getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * 设置当前健康状态，true：健康，false：不健康。
     * @param HealthStatus 当前健康状态，true：健康，false：不健康。
     */
    public void setHealthStatus(Boolean HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * 获取Target的实例ID，如 ins-12345678
     * @return TargetId Target的实例ID，如 ins-12345678
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * 设置Target的实例ID，如 ins-12345678
     * @param TargetId Target的实例ID，如 ins-12345678
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);

    }
}

