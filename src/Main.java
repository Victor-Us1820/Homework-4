public class Main {
    public static void main(String[] args) {
        // Задача 1;
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
        // Задача 2;
        var enlargedDog = dog + 4;
        var enlargedCat = cat + 4;
        var enlargedPaper = paper + 4;
        System.out.println("enlargedDog = " + enlargedDog + " enlargedCat = " + enlargedCat + " enlargedPaper = " + enlargedPaper);
        // Задача 3;
        var reducedDog = dog - 3.5;
        var reducedCat = cat -1.6;
        var reducedPaper = paper - 7639;
        System.out.println("reducedDog = " + reducedDog + " reducedCat = " + reducedCat + " reducedPaper = " + reducedPaper);
        // Задача 4;
        var friend = 19;
        System.out.println("friend = " + friend);
        var enlargedFriend = friend + 2;
        System.out.println("enlargedFriend = " + enlargedFriend);
        var sharedFriend = enlargedFriend / 7;
        System.out.println("sharedFriend = " + sharedFriend);
        // Задача 5;
        var frog = 3.5;
        System.out.println("frog = " + frog);
        var enlargedFrog = frog * 10;
        System.out.println("enlargedGrog = " + enlargedFrog);
        var sharedFrog = enlargedFrog / 3.5;
        System.out.println("sharedFrog = " + sharedFrog);
        var reducedFrog = sharedFrog + 4;
        System.out.println("reducedFrog = " + reducedFrog);
        // Задача 6;
        var firstBoxer = 78.2; // Масса первого боксёра.
        var secondBoxer = 82.7; // Масса второго боксёра.
        var totalWeight = firstBoxer + secondBoxer; // Находим общий вес бойцов.
        System.out.println("Общий вес бойцов = " + totalWeight + " кг.");
        var weightDifference = secondBoxer - firstBoxer; // Находим разницу между массами бойцов.
        System.out.println("Разница между массами двух бойцов = " + weightDifference + " кг.");
        // Задача 7
        var remainderOfDivision = secondBoxer % firstBoxer; // Находим остаток от деления между двумя весами.
        System.out.println("Остаток от деления массы второго бойца на массу первого = " + remainderOfDivision + " кг.");
        // Задача 8
        var totalOfHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployeesInCompany = totalOfHours / hoursPerEmployee; // Находим сколько всего работников в компании.
        System.out.println("Всего работников в компании - " + totalEmployeesInCompany + " человек.");
        var additionalStaff = 94;
        var newTotalEmployeesInCompany = additionalStaff + totalEmployeesInCompany; // Находим новое, общее количество сотрудников.
        var newtotalOfHours = newTotalEmployeesInCompany * hoursPerEmployee; // Находим новое, общее количество часов.
        System.out.println("Если в компании работает - " + newTotalEmployeesInCompany + " человек, то всего - " + newtotalOfHours + " часа работы может быть поделено между сотрудниками.");
    }
}