/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class App {

  public static void main(String[] args) throws Exception {
    String file = "mybatis-config.xml";
    Reader reader = Resources.getResourceAsReader(file);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    //操作数据库1"
    //UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    //User user = userMapper.selectUserByLoginId("admin");
    //第二种操作方式
    User user = sqlSession.selectOne("mapper.UserMapper.selectUserByLoginId", "admin");
    System.out.println(user);
  }
}
