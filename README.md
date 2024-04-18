# 스프링 부트 서버 - Azure AI 연동 데모
## 개요
스프링 부트 기반 백엔드 서버에 Azure OpenAI API를 연동하는 데모 프로젝트.<br>
Azure OpenAI API key 및 엔드포인트 등의 비공개 정보를 담은 변수는 application.properties에 작성한 뒤 코드 상에서 @Value 어노테이션으로 불러와 사용함. application.properties는 본 원격 리포지토리에 업로드되어있지 않음.
## 참고한 사이트
디펜던시<br>
https://mvnrepository.com/artifact/com.azure/azure-ai-openai<br><br>
맥북 스프링, 그레이들, 자바 설정 중 마주친 문제 해결<br>
https://blog.naver.com/PostView.naver?blogId=tofhadl529&logNo=222374497101<br><br>
스프링 부트에서 Azure Open AI를 사용하는 법에 관한 공식문서<br>
https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/openai/azure-ai-openai/README.md<br>
https://techcommunity.microsoft.com/t5/apps-on-azure-blog/building-intelligent-spring-apps-with-azure-openai/ba-p/3857203
