![image](https://github.com/therotherithethethe/javafxcruddemo/assets/98651796/c43b56c5-ff13-453d-8634-1195655aecae)
спідмейнт щось не юзав. проте юзав spring jdbctemplate. зарахуєте 3 практичні

<details>
  <summary>async task</summary>
  
```java
private void generateDataBtnClick(ActionEvent event) {
        //userRepo.generateData(Integer.parseInt(countOfDataTxtf.getText()));

        int count = Integer.parseInt(countOfDataTxtf.getText());

        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                // Generate data here
                userRepo.generateData(count);
                return null;
            }
        };

        task.setOnSucceeded(workerStateEvent -> {
            System.out.println("success");
        });
        new Thread(task).start();
    }
```

</details>
