
## Installation

Installation of clvt_us-ccfees-rme_automation project

- Download [jetbrains-intelliJ](https://www.jetbrains.com/idea/download/?section=windows) Community Edition
- Download [git bash](https://git-scm.com/downloads)
- Download [Java](https://www.java.com/download/ie_manual.jsp)
- Download [JDK 20](https://jdk.java.net/20/)
- Setup Java PATH - Windows
    - Go to you Desktop > right-click on My PC > Properties
    - Advaced tab > Environmet variables
    - Click on New, and type PATH in the Variable Name, and enter the path of the bin of installed JDK in the Variable Value field **C:\Program Files\Java\jdk-20**.
    - Open cmd
```bash
  java -version 
```
- Dowload code navigate to [portfolio](https://github.com/imrodre1990/portfolio) project in github.
    - Click Code button
    - Copy **HTTPS URL**
- Open git bash
    - Run the following commands

```bash
  cd <your-workspace-path>
  git clone <your-project-https-url>
  cd portfolio
  git checkout -b <your-branch-name>
```
- Open IntelliJ and load existing project **your-workspace-path/portfolio**
    - Right click **portfolio** in the project section
    - Maven > Generate Sources and Update Folders
    - Maven > Clean
    - Maven > Install
    - File > Invalidate Caches... > Invalidate and restart

## 🚀 Happy testing!!