//
//  AppDelegate.m
//  NetEasyMusic_iOS
//
//  Created by chenhao on 16/9/8.
//  Copyright © 2016年 com.chh. All rights reserved.
//

#import "AppDelegate.h"

@interface AppDelegate ()

@end

@implementation AppDelegate


- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    // Override point for customization after application launch.
    UITabBarController *rootController = [[UITabBarController alloc]init];
    self.window.rootViewController = rootController;
    UIViewController *c1 = [[UIViewController alloc]init];
    c1.view.backgroundColor = [UIColor grayColor];
    c1.tabBarItem.image = [UIImage imageNamed:@"icn_discover"];
    c1.tabBarItem.selectedImage = [UIImage imageNamed:@"icn_discover_prs"];
    c1.tabBarItem.title = @"发现音乐";
    
    UIViewController *c2 = [[UIViewController alloc]init];
    c2.view.backgroundColor = [UIColor grayColor];
    
    c2.tabBarItem.image = [UIImage imageNamed:@"icn_music"];
    c2.tabBarItem.selectedImage = [UIImage imageNamed:@"icn_music_prs"];
    c2.tabBarItem.title = @"我的音乐";
    
    
    UIViewController *c3 = [[UIViewController alloc]init];
    c3.view.backgroundColor = [UIColor grayColor];
    c3.view.backgroundColor=[UIColor redColor];
    c3.tabBarItem.image = [UIImage imageNamed:@"icn_friend"];
    c3.tabBarItem.selectedImage = [UIImage imageNamed:@"icn_friend_prs"];
    c3.tabBarItem.title = @"朋友";
    
    
    UIViewController *c4 = [[UIViewController alloc]init];
    c4.view.backgroundColor = [UIColor grayColor];
    
    c4.tabBarItem.image = [UIImage imageNamed:@"icn_account"];
    c4.tabBarItem.selectedImage = [UIImage imageNamed:@"icn_account_prs"];
    c4.tabBarItem.badgeValue=@"2";
    c4.tabBarItem.title = @"账号";
    
    
    rootController.viewControllers = @[c1, c2, c3, c4];
    [rootController.tabBar setTintColor:[UIColor redColor]];
    [self.window makeKeyAndVisible];
    
    return YES;
}

- (void)applicationWillResignActive:(UIApplication *)application {
    // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
    // Use this method to pause ongoing tasks, disable timers, and throttle down OpenGL ES frame rates. Games should use this method to pause the game.
}

- (void)applicationDidEnterBackground:(UIApplication *)application {
    // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
    // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
}

- (void)applicationWillEnterForeground:(UIApplication *)application {
    // Called as part of the transition from the background to the inactive state; here you can undo many of the changes made on entering the background.
}

- (void)applicationDidBecomeActive:(UIApplication *)application {
    // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
}

- (void)applicationWillTerminate:(UIApplication *)application {
    // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
}

@end
