# Brivox

Brivox is a self-hosted File Management System designed to provide a secure and efficient way to store, manage, and transfer files. This project serves as a personal alternative to mainstream cloud storage solutions, giving you full control over your data.

## Overview

Brivox is a web-based platform built with a focus on security and scalability. Whether you are looking to back up important documents or share files across devices, Brivox provides a streamlined interface and a powerful backend to handle your file system needs.

## Tech Stack

The project leverages a modern Java ecosystem to ensure high performance and reliability:

* Backend: Java 25+
* Framework: Spring Boot
    * Spring Web: For building the RESTful API.
    * Spring Security: To handle authentication and authorization.
    * Spring Data JPA: For seamless database communication.
* Build Tool: Gradle
* Database: SQLite (Lightweight, file-based persistence)

## Features (Roadmap)

- [ ] User Authentication: Protected access to your personal file system via Spring Security.
- [ ] Secure File Upload/Download: Seamlessly move files between your local machine and the server.
- [ ] Directory Management: Organize your data using a nested folder structure.
- [ ] File Sharing: Generate secure links to transfer files to other users.

## Resources

### Icons
* Document Type Icons (svgrepo): https://www.svgrepo.com/collection/document-type-line-icons/
* Menu Icons (svgrepo): https://www.svgrepo.com/collection/coolicons-line-oval-icons/

---

## Getting Started

### Prerequisites
* JDK 25 LTS
* Gradle

### Installation
1. Clone the repository:
   git clone https://github.com/CourtesiLOL/Brivox

2. Configure your application.properties to point to your SQLite file:
   if you don't have a complatible SQLite file the application make a new one on the first run.
   spring.jpa.database-platform=org.hibernate.community.dialect.SQLiteDialect

3. Build the project:
   ./gradlew build

4. Run the application:
   ./gradlew bootRun

---
