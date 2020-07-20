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
package mapper;

import com.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
  /**
   *
   * @param loginId
   * @return
   * 用xml方式时候需要将@Select注释，否则会报错
   */
    //@Select("select * from sys_user where login_id = #{loginId}")
    User selectUserByLoginId(String loginId);
}
