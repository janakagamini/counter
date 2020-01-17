//
//  ViewController.swift
//  Counter
//
//  Created by Janaka on 16/1/20.
//  Copyright © 2020 Janaka. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    var count = 0
    @IBOutlet weak var counterLabel: UILabel!
    
    @IBAction func incrementButton(_ sender: UIButton) {
        count += 1
        counterLabel.text = String(count)
        
        if (count % 5 == 0) {
            let alert = UIAlertController(title: "Alert", message: "Reset?", preferredStyle: .alert)
            alert.addAction(UIAlertAction(title: "YES", style: .default, handler: { _ in
                self.count = 0
                self.counterLabel.text = String(self.count)
            }))
            alert.addAction(UIAlertAction(title: "NO", style: .default, handler: nil))
            self.present(alert, animated: true, completion: nil)
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        
        counterLabel.text = String(count)
    }


}

