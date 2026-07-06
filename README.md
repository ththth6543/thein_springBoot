# Spring Boot Study Repository

이 저장소는 스프링 부트(Spring Boot)를 학습하며 진행한 프로젝트들을 모아놓는 통합 학습 저장소입니다.

---

## 📂 Project Directory

각 프로젝트 폴더로 이동하면 상세한 설명이 기재된 프로젝트별 `README.md`를 확인하실 수 있습니다.

| 프로젝트명 | 설명 | 기술 스택 | 링크 |
| :--- | :--- | :--- | :--- |
| [demo](./demo) | REST API 방식을 활용한 간단한 사칙연산 계산기 서비스 | Java 21, Spring Boot 3.5, Gradle | [바로가기](./demo/README.md) |

---

## ⚙️ 실행 방법 및 주의사항

각 프로젝트는 독립된 Gradle 프로젝트로 구성되어 있습니다. 특정 프로젝트를 실행하려면 하위 디렉토리로 이동한 후 부트런(bootRun)을 수행합니다.

```bash
# 예시: demo 프로젝트 실행 방법
cd demo
./gradlew bootRun
```
