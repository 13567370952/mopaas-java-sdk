// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.mopaas.sdk.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mopaas.sdk.MoPaaSClient;
import com.mopaas.sdk.vo.MoPaaSInVo;
import com.mopaas.sdk.vo.MoPaaSOut2Vo;
import com.mopaas.sdk.vo.MoPaaSOutVo;

/**
 * 
 * @author YeFeng Shen<yfshen@anchora.me>
 * 
 */
public class MoPaaSPayClientTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    MoPaaSClient client = MoPaaSClient.newClient("968f6de8-117b-4236-b10e-25e790a198b7", "1c2c4861-ca1e-4f05-97b8-e7d5a4f2d232");
    
    @Test
    public void testBalance() {
        MoPaaSInVo in = new MoPaaSInVo();
        in.setMethod("GET");
        in.setUri("/api/v2/pay/balance");
        
        MoPaaSOutVo out = client.exec(in, MoPaaSOutVo.class);

        Assert.assertEquals("API_0", out.getCode());
        Assert.assertNull(out.getList());
        Assert.assertNotNull(out.getResult());
    }

    @Test
    public void testPayList() {
        MoPaaSInVo in = new MoPaaSInVo();
        in.setMethod("GET");
        in.setUri("/api/v2/pay/list");
        
        MoPaaSOutVo out = client.exec(in, MoPaaSOutVo.class);

        Assert.assertEquals("API_0", out.getCode());
        Assert.assertNull(out.getList());
        Assert.assertNotNull(out.getResult());
    }

    @Test
    public void testBalanceDetails() {
        MoPaaSInVo in = new MoPaaSInVo();
        in.setMethod("GET");
        in.setUri("/api/v2/pay/balanceDetails");
        
        MoPaaSOutVo out = client.exec(in, MoPaaSOutVo.class);

        Assert.assertEquals("API_0", out.getCode());
        Assert.assertNotNull(out.getList());
        Assert.assertNull(out.getResult());
    }
    
    @Test
    public void testBugdet() {
        MoPaaSInVo in = new MoPaaSInVo();
        in.setMethod("GET");
        in.setUri("/api/v2/pay/bugdet");
        
        MoPaaSOut2Vo out = client.exec(in, MoPaaSOut2Vo.class);

        Assert.assertEquals("API_0", out.getCode());
        Assert.assertNotNull(out.getResult());
    }
}
