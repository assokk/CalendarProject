## API 명세

### 1. 일정 생성

| 항목           | 내용                                                              |
|----------------|-----------------------------------------------------------------|
| **URL**        | `POST /schedules`                                               |
| **Request Body** | - `title`  <br> - `content` <br> - `writer` <br> - `password`  |
| **Response Body** | - `id` <br> - `title` <br> - `content` <br> - `writer` <br> - `createdAt` <br> - `modifiedAt` |



### 2. 전체 일정 조회

| 항목            | 내용                            |
|-----------------|---------------------------------|
| URL             | GET /schedules                  |
| Request Params  | (선택) `writer` (작성자명)     |
| Response Body   | - `id` <br> - `title` <br> - `content` <br> - `writer` <br> - `createdAt` <br> - `modifiedAt` |

### 3. 선택 일정 조회

| 항목            | 내용              |
|-----------------|-------------------|
| URL             | GET /schedules/{id} |
| Path Variable   | `id`          |
| Response Body   | - `id` <br> - `title` <br> - `content` <br> - `writer` <br> - `createdAt` <br> - `modifiedAt` |


### 4. 일정 수정

| 항목            | 내용                          |
|-----------------|-------------------------------|
| URL             | PUT /schedules/{id}           |
| Request Body    | - `title` <br> - `writer` <br> - `password` |
| Response Body   | - `id` <br> - `title` <br> - `content` <br> - `writer` <br> - `createdAt` <br> - `modifiedAt` |
| Error           | 403 Forbidden - 비밀번호 불일치 |


### 5. 일정 삭제

| 항목            | 내용                          |
|-----------------|-------------------------------|
| URL             | DELETE /schedules/{id}        |
| Request Body    | - `password`                    |
| Error           | 403 Forbidden - 비밀번호 불일치 |



![ERD](./erd.png)

